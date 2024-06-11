package com.example.demo;

public class Tarefa {
    public Tarefa(int id, String descricao, boolean concluida) {
        this.setId(id);
        this.setConcluida(concluida);
        this.setDescricao(descricao);
    }


        private int id;
        private String descricao;
        private boolean concluida;

            public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public boolean isConcluida() {
            return concluida;
        }

        public void setConcluida(boolean concluida) {
            this.concluida = concluida;

        }
    }
