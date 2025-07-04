
Public class Contato {
    private String nome;
    private String telefone;
    private String email;
    
    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    
    @Override
    public String toString() {
        return String.format("Nome: %s, Telefone: %s, Email: %s", nome, telefone, email);
    }
}