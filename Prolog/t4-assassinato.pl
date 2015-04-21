%Trabalho 4 - Prolog
%Nome: Francis Mallmann Schappo
%Matricula: 201021524

%Vitima do crime
vitima(anita).

%Suspeitos
suspeito(pedro).
suspeito(caren).
suspeito(henrique).
suspeito(bia).
suspeito(adriano).
suspeito(alice).
suspeito(bernardo).
suspeito(maria).

%Dias da Semana
dia(segunda).
dia(terca).
dia(quarta).
dia(quinta).
dia(sexta).

%Condição financeira
pobre(bia).
pobre(pedro).
rico(alice).
rico(pedro).
pobre(maria).
rico(adriano).
rico(caren).
rico(henrique).

%Relacionamentos dos envolvidos
relacionamento(anita, bernardo).
relacionamento(bernardo, caren).
relacionamento(anita, pedro).
relacionamento(pedro, alice).
relacionamento(alice, henrique).
relacionamento(henrique, maria).
relacionamento(maria, adriano).
relacionamento(adriano, caren).

%Cidades
cidade(santa_maria).
cidade(porto_alegre).

%Motivos de Crime
motivo(dinheiro).
motivo(ciumes).
motivo(insanidade).

%Ferramentas para o Crime
ferramenta(bastao_baseball).
ferramenta(martelo).

%Insanos
insano(adriano).
insano(maria).

%Fatos
fato(pedro, santa_maria, segunda).
fato(pedro, santa_maria, terca).
fato(pedro, porto_alegre, quarta).
fato(pedro, santa_maria, quinta).
fato(pedro, apartamento, sexta).

fato(caren, porto_alegre, segunda).
fato(caren, porto_alegre, terca).
fato(caren, porto_alegre, quarta).
fato(caren, santa_maria, quinta).
fato(caren, apartamento, sexta).

fato(henrique, apartamento, segunda).
fato(henrique, porto_alegre, terca).
fato(henrique, apartamento, quarta).
fato(henrique, apartamento, quinta).
fato(henrique, apartamento, sexta).

fato(bia, apartamento, segunda).
fato(bia, porto_alegre, terca).
fato(bia, porto_alegre, quarta).
fato(bia, santa_maria, quinta).
fato(bia, apartamento, sexta).

fato(adriano, apartamento, segunda).
fato(adriano, apartamento, terca).
fato(adriano, santa_maria, quarta).
fato(adriano, apartamento, quinta).
fato(adriano, apartamento, sexta).

fato(alice, apartamento, segunda).
fato(alice, porto_alegre, terca).
fato(alice, porto_alegre, quarta).
fato(alice, apartamento, quinta).
fato(alice, apartamento, sexta).

fato(bernardo, santa_maria, segunda).
fato(bernardo, santa_maria, terca).
fato(bernardo, porto_alegre, quarta).
fato(bernardo, santa_maria, quinta).
fato(bernardo, apartamento, sexta).

fato(maria, apartamento, segunda).
fato(maria, santa_maria, terca).
fato(maria, santa_maria, quarta).
fato(maria, santa_maria, quinta).
fato(maria, apartamento, sexta).


apart(X) :- fato(X, apartamento, sexta), fato(X, apartamento, quinta).


%roubos
roubo_da_chave(X) :- fato(X, santa_maria, quarta), fato(X, porto_alegre, terca).
roubo_bastao(X) :- fato(X, porto_alegre, quinta), fato(X, santa_maria, quarta).
roubo_martelo(X) :- fato(X, apartamento, quarta), fato(X, apartamento, quinta).
roubo_da_arma(X) :- roubo_bastao(X), roubo_martelo(X).

%quem tem ciumes?
tem_ciumes(A, B) :- relacionamento(A, X), relacionamento(B, X).

%invasao do quarto
acesso(X) :- apart(X), roubo_da_chave(X), roubo_da_arma(X).
motivo(X) :- tem_ciumes(X, anita); pobre(X); insano(X). 
assassino(X) :- motivo(X), acesso(X).