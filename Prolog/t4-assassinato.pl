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