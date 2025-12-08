-- V2: Migration para adicionar a coluna de Classe na tabela de Cadastros

ALTER TABLE tb_cadastro
ADD COLUMN classe VARCHAR(255)