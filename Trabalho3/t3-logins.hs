import Data.Char

nomeusuario :: String -> String
nomeusuario (x:xs) = map (toLower) ( x : reverse ( takeWhile (/= ' ')(reverse xs) ) )

main :: IO ()
main = do
    strcontent <- readFile "nomes.csv"
    let strlist = lines strcontent
        strnew = map (\y -> y ++ "," ++ nomeusuario y) strlist
    writeFile "logins.csv" (unlines strnew)