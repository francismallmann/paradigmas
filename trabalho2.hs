geraPotencias :: Int -> [Int]
geraPotencias 0 = []
geraPotencias x = [2^x | x <- [x, x-1..0]]


addSuffix :: String -> [String] -> [String]
addSuffix x y = [y ++ x | y <- y]

anosDeNascimento :: [Int] -> [Int]
anosDeNascimento [] = []
anosDeNascimento x = [if x>20 then 2015 - x else 0 | x <- x] 