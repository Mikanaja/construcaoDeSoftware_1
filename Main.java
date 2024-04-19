// Mesmo que a descrição da tarefa não exigisse o arquivo "Main.java", eu resolvi criar para exemplificar o funcionamento do programa na prática.


public class Main {
    public static void main(String[] args) {
        // Criando instâncias de algumas classes para teste
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("João da Silva");
        pessoa.setSexo("M");
        pessoa.setDataNascimento(new Date());

        Endereco endereco = new Endereco();
        endereco.setTipoLogradouro(TipoLogradouro.Rua);
        endereco.setNumero(123);
        endereco.setComplemento("Apto 101");
        endereco.setCEP(12345678);
        endereco.setTipoEndereco(TipoEndereco.Residencial);

        Bairro bairro = new Bairro();
        bairro.setNome("Centro");
        endereco.setBairro(bairro);

        Cidade cidade = new Cidade();
        cidade.setNome("São Paulo");
        endereco.setCidade(cidade);

        Estado estado = new Estado();
        estado.setSigla("SP");
        estado.setNome("São Paulo");
        endereco.setEstado(estado);

        Pais pais = new Pais();
        pais.setNome("Brasil");
        endereco.setPais(pais);

        // Adicionando o endereço à pessoa
        List<Endereco> enderecos = new ArrayList<>();
        enderecos.add(endereco);
        pessoa.setEnderecos(enderecos);

        // Imprimindo informações para teste
        System.out.println("Nome da pessoa: " + pessoa.getNome());
        System.out.println("Endereço da pessoa:");
        System.out.println("Tipo de logradouro: " + endereco.getTipoLogradouro());
        System.out.println("Número: " + endereco.getNumero());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("CEP: " + endereco.getCEP());
        System.out.println("Tipo de endereço: " + endereco.getTipoEndereco());
        System.out.println("Bairro: " + endereco.getBairro().getNome());
        System.out.println("Cidade: " + endereco.getCidade().getNome());
        System.out.println("Estado: " + endereco.getEstado().getNome());
        System.out.println("País: " + endereco.getPais().getNome());
    }
}
