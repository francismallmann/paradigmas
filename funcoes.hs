--Nome: Francis Mallmann Schappo
--Paradigmas da Programação - UFSM
--Matricula: 201021524



-- Soma os quadrados de 2 numeros
doubleUs :: Int -> Int -> Int   
doubleUs x y = x^2 + y^2
  
-- Verifica se um numero eh par (mod retorna resto da divisao inteira)
isEven :: Int -> Bool
isEven n = if mod n 2 == 0 then True else False
  
-- Gera um numero a partir de um caracter
encodeMe :: Char -> Int
encodeMe c 
  | c == 'S'  = 0
  | c == 'N'  = 1
  | otherwise = 2
  
-- Calcula o quadrado do primeiro elemento da lista
doubleFirst :: [Int] -> Int
doubleFirst lis = (head lis)^2


--Escreva uma função hasEqHeads :: [Int] -> [Int] -> Bool que verifica se as 2 listas possuem o mesmo primeiro elemento. Exemplo de uso:
hasEqHeads :: [Int] -> [Int] -> Bool
hasEqHeads x y = if (head x) == (head y) then True else False


--Observe a função abaixo, que eleva ao cubo cada elemento da lista, produzindo outra lista.
pot3 :: [Int] -> [Int]
pot3 [] = []
pot3 ns = (head ns)^3 : pot3 (tail ns)

--Escreva uma função recursiva add10, que adicione a constante 10 a cada elemento de uma lista, produzindo outra lista.
add10 :: [Int] -> [Int]
add10 [] = []
add10 (x:xs) = x+10 : add10 (xs)

--Escreva uma função recursiva addComma, que adicione uma vírgula no final de cada string contida numa lista. Dica: (1) Strings são listas de caracteres. (2) Para concatenar listas, use o operador ++.
addComma :: [String] -> [String]
addComma [] = []
addComma x = ((head x) ++ ",") : addComma (tail x)

--Refaça os 2 exercícios anteriores usando a função de alta ordem 'map'.
add10map :: [Int] -> [Int]
add10map [] = []
add10map x = map (+10) x

addCommamap :: [String] -> [String]
addCommamap [] = []
addCommamap x = map (++ ",") x

--Crie uma função htmlListItems :: [String] -> [String], que receba uma lista de strings e retorne outra lista contendo as strings formatadas como itens de lista em HTML. Dica: use map e defina uma função auxiliar a ser aplicada a cada elemento. Exemplo de uso da função:
htmlListItems :: [String] -> [String]
htmlListItems [] = []
htmlListItems x = ( "<LI>" ++ head x ++ "</LI>" ) : htmlListItens(tail x)

--Crie uma função recursiva charFound :: Char -> String -> Bool, que verifique se o caracter (primeiro argumento) está contido na string (segundo argumento). Exemplos de uso da função:
charFound :: Char -> String -> Bool
charFound x y 
		| y == [] = False
		| x == head y = True
		| x /= head y = charFound x (tail y)



