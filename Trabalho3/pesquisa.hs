--Nome: Francis Mallmann Schappo
--Paradigmas da Programação - UFSM
--Matricula: 201021524



--1 ANY
--Referencia: http://www.cse.chalmers.se/edu/year/2014/course/TDA452/Haskell-Prelude-Tour-A4.pdf
--Aplicado a um predicado e uma lista, retorna True se algum elemento da lista safisfaz
--o predicado e Falso se não.
--
--ALL
--Parecido com o ANY, retorna True quando todos os elementos da lista satisfazem o predicado
--e False não satisfaz.

any ::  (a -> Bool) -> [a] -> Bool
any p xs = or (map p xs)


all ::  (a -> Bool) -> [a] -> Bool
all p xs = and (map p xs)

--2
--$
--http://stackoverflow.com/questions/940382/haskell-difference-between-dot-and-dollar-sign
--O cifrão facilita o uso de parenteses, ou diminui o uso deles

--Prelude> head (tail "asdf")
--'s'

--Prelude> head $ tail "asdf"
--'s'

allcifrao ::  (a -> Bool) -> [a] -> Bool
allcifrao p xs = and $ map p xs


--3
--
--Composição de Função é utilizado com o (.), junta duas funções.
--Referencia: http://www.cse.chalmers.se/edu/year/2014/course/TDA452/Haskell-Prelude-Tour-A4.pdf

desort = (reverse . sort)

(.) :: (b -> c) -> (a -> b) -> a -> c
--Prelude> (sqrt . sum ) [1,2,3,4,5]
--3.87298