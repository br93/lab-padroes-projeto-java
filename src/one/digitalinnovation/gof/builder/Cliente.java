package one.digitalinnovation.gof.builder;

public final class Cliente {
    private final String nome;
    private final String cpf;
    private final String empresa;

    Cliente(Builder builder){
        this.nome = builder.nome;
        this.cpf = builder.cpf;
        this.empresa = builder.empresa;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmpresa() {
        return empresa;
    }

    public static class Builder {
        private final String nome;
        private final String cpf;
        private final String empresa;

        public Builder(String nome, String cpf, String empresa)
        {
            this.nome = nome;
            this.cpf = cpf;
            this.empresa = empresa;
        }

        public Cliente build() {
            return new Cliente(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "nome='" + nome + '\'' +
                    ", cpf='" + cpf + '\'' +
                    ", empresa='" + empresa + '\'' +
                    '}';
        }
    }
 }


