package model;

import java.util.List;

// 4.2.1 associacao unaria

public class Funcionario {
    // relacao de chefe (q eh um funcionario) com funcionarios

    private String nome;
    //muitos é representado por uma lista (colecao) de objetos
    //se nao tem nada é 1
    List<Funcionario> funcionario;
}
