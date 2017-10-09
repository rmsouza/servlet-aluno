/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.HashMap;
import model.Aluno;

/**
 *
 * @author ra21067003
 */
public class AlunoService {
 
    public static HashMap<Integer, Aluno> getAlunos() {
        
        HashMap<Integer, Aluno> alunos = new HashMap<>();
        
        alunos.put(1234, new Aluno("João", 1234));
        alunos.put(1235, new Aluno("Maria", 1235));
        alunos.put(1236, new Aluno("Pedro", 1236));
        
        return alunos;
        
    }
    
}
