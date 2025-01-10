package model;

public class Cep {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;

    public Cep(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String ibge) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
    }

    public String getCep() {
        return cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public String getUf() {
        return uf;
    }
    public String getIbge() {
        return ibge;
    }

   @Override
   public String toString() {
      return "Endereço [" + "CEP: " + cep + ", Logradouro: " + logradouro + ", Complemento: " + complemento + ", Bairro: " + bairro + ", Localidade: " + localidade + ", UF: " + uf + ", IBGE: " + ibge + "]";
   }



}
