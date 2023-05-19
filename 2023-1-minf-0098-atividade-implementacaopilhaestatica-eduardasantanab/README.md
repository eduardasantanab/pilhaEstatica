[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=10466799&assignment_repo_type=AssignmentRepo)
# Atividade de Apresentação
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="250"/>

## Identificação
**Disciplina**: Estrutura de Dados I
\
**Atividade**: Implementação Pilha Estática
- [@mjcea - Prof. Marcos Canêjo](marcos.azevedo@unicap.br)

## Instruções
- Sua implementação deve estar dentro da pasta src/**main**/java 
- Não modifique nenhum código dentro da pasta src/**test**/java
- *Commits* fora do prazo **serão desconsiderados**

##  Descrição
Implemente a estrutura de dados ``Pilha`` de acordo com a seguinte assinatura:
```java
  public class PilhaEstatica {
    public int[] elementos;
    public int tamanho;
    public int topo;

    public PilhaEstatica(int tamanho){}
    public void push(int valor){}
    public int pop(){}
    public boolean isEmpty(){}
    public int peek(){} // verificar o elemento no topo da pilha
  }
```
