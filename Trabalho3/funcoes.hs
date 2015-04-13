--Nome: Francis Mallmann Schappo
--Paradigmas da Programação - UFSM
--Matricula: 201021524

import Data.Char


--1
firstName :: String -> String
firstName nome
	|head nome == ' ' = " "
	|otherwise = head nome : firstName(tail nome)

--2
firstName2 :: String -> String
firstName2 nome = takeWhile (/= ' ') nome

--3
lastName :: String -> String
lastName nome = reverse (takeWhile (/= ' ') (reverse nome))

--4
userName :: String -> String
userName nome = toLower (head nome) : map toLower (lastName nome)

--5
encodeName :: String -> String
encodeName nome = concat (map (tradeWords) nome)
	where tradeWords nome
		| name == 'a' = "4" 
		| name == 'A' = "4"
		| name == 'e' = "3" 
		| name == 'E' = "3" 
		| name == 'i' = "1"
		| name == 'I' = "1" 
		| name == 'o' = "0"
		| name == 'O' = "0" 
		| name == 'u' = "00"
		| name == 'U' = "00"
		| otherwise = [nome]


--6
isElem :: Int -> [Int] -> Bool
isElem x list
	| list == [] = False
	| head(list) == x = True
	| otherwise = isElem x (tail list)


--7
vogais :: String -> Int
vogais [] = 0
vogais x = (cont (head x)) + (vogais (tail x))
	where cont x
		| x == 'a' = 1
		| x == 'e' = 1
		| x == 'i' = 1
		| x == 'o' = 1
		| x == 'u' = 1
		| otherwise = 0

--8
consoantes :: String -> Int
consoantes [] = 0
consoantes x = length (filter (\ x -> (x /= 'a') && (x /= 'e') && (x /= 'i') && (x /= 'o') && (x /= 'u') && (x /= 'A') && (x /= 'E') && (x /= 'I') && (x /= 'O') && (x /= 'U') && (x /= ' ')) x)




--9
isInt :: String -> Bool
isInt [] = False
isInt str = let a = and(map(>= '0') str)
		b = and(map(<= '9') str)
	    in a && b


-- Exercicio 10
strToInt :: String -> Int
strToInt str = sum $ zipWith (*) (map(digitToInt) str) (map(10^) [length(str) - 1, length(str) - 2..])