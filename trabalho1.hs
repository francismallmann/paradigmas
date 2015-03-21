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
htmlListItens :: [String] -> [String]
htmlListItens [] = []
htmlListItens x = ( "<LI>" ++ head x ++ "</LI>" ) : htmlListItens(tail x)

--Crie uma função recursiva charFound :: Char -> String -> Bool, que verifique se o caracter (primeiro argumento) está contido na string (segundo argumento). Exemplos de uso da função:
charFound :: Char -> String -> Bool
charFound x y 
		| y == [] = False
		| x == head y = True
		| x /= head y = charFound x (tail y)

--Reescreva a função anterior sem recursão, usando outras funções pré-definidas já vistas em aula.
charFound2 :: Char -> String -> Bool
charFound2 x y = or $ map (==x) y

--Use a função de alta ordem 'zipWith' para produzir uma função que obtenha as diferenças, par a par, dos elementos de duas listas. Por exemplo: para listas de entrada [1,2,3,4] e [2,2,1,1], o resultado será [-1,0,2,3].
ziping :: [Int] -> [Int] -> [Int]
ziping x y = zipWith (-) x y

--Alta Ordem

--Dada uma lista de números, calcular 2*n+1 para cada número n contido na lista.
callis :: [Int] -> [Int]
callis [] = []
callis x = map (\x -> 2*x+1) x

--Dadas duas listas X e Y de números inteiros, calcular 4*x+2*y+1 para cada par de números x e y pertencentes às listas. Exemplo:
callis2 :: [Int] -> [Int] -> [Int]
callis2 [] [] = []
callis2 x y = zipWith (\x y -> 4*x+2*y+1) x y

--Dada uma lista de strings, produzir outra lista com strings de 10 caracteres, usando o seguinte esquema: strings de entrada com mais de 10 caracteres são truncadas, strings com até 10 caracteres são completadas com '.' até ficarem com 10 caracteres. Exemplo:
letras :: [String] -> [String]
letras [] = []
letras (a:b) = take 10 (a ++ (repeat '.')) : letras b

--Dada uma lista de idades, selecionar as que são maiores que 20 e, para cada uma, calcular o ano de nascimento correspondente (aproximado, considerando o ano atual).
idade :: [Int] -> [Int]
idade [] = []
idade n = map(\n -> 2015 - n) (filter(>20)n)



