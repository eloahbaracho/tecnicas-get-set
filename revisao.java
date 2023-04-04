import javax.swing.JOptionPane;
public class TestePessoa {
    public static void main(String... args) {
        Cliente c1 = new Cliente("Fulano", "21312-2132", 125.40f);
        c1.setNome("nomeexemplo");
        c1.print();
        JOptionPane.showMessageDialog(null, "Juros: " + c1.calculaJuros(1.5f));
        Fornecedor f1 = new Fornecedor("Empresa xx", "87382-4234", 1500.89f);
        f1.calculaImpostos((12.5f));
        f1.print();
    }
}


import javax.swing.*;

public class Cliente extends Pessoa {
    private Float valorDivida;
    Cliente(){}
    Cliente(String n, String f, float vd) {
        super(n, f);
        valorDivida = vd;
    }
    public float getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }
    public void print() {
        super.print();
        JOptionPane.showMessageDialog(null, "\nValor da Divida: " + valorDivida);
    }
    public float calculaJuros(float tx) {
        return valorDivida *tx/100;
    }
}

import javax.swing.*;

public class Fornecedor extends Pessoa {
    private float valorCompra;
    Fornecedor() {}
    Fornecedor(String n, String f, Float vc) {
        super(n, f);
        valorCompra = vc;
    }
    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
    public void print() {
        super.print();
        JOptionPane.showMessageDialog(null, "\nValor da Compra:" + valorCompra);
    }
    public void calculaImpostos(float imposto) {
        valorCompra += valorCompra *imposto/100;
    }
}
import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private String telefone;
    Pessoa() {}
    Pessoa(String n, String f) {
        nome = n;
        telefone = f;
    }
    public String getNome () {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFone() {
        return telefone;
    }
    public void setFone(String telefone) {
        this.telefone = telefone;
    }
    public void print() {
        JOptionPane.showMessageDialog(null, "Dados \nNome:" + nome + "\nTelefone: " + telefone);
    }

}
