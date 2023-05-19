package com.atividade;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Testes {
  
  @Test
   public void test01isEmpty(){
      PilhaEstatica p = new PilhaEstatica(5);
      boolean expected = true;
      boolean actual = p.isEmpty();
      assertEquals(expected, actual);
   }

   @Test
   public void test02push(){
      int tamanho = 5;
      PilhaEstatica p = new PilhaEstatica(tamanho);
      p.push(5);
      p.push(10);
      p.push(15);
      p.push(20);
      p.push(25);

      int[] expected = {5, 10, 15, 20, 25};
      int[] actual = p.elementos;

      assertArrayEquals(expected, actual);
   }

   @Test
   public void test03pop(){
      int tamanho = 5;
      PilhaEstatica p = new PilhaEstatica(tamanho);
      p.push(5);
      p.push(10);
      p.push(15);
      p.push(20);
      p.push(25);

      int[] expected = {25, 20, 15, 10, 5};
      int[] actual = new int[tamanho];

      for(int i=0; i < actual.length; i++){
         actual[i] = p.pop();
      }

      assertArrayEquals(expected, actual);
   }

   @Test
   public void test04peek(){
      int tamanho = 5;
      PilhaEstatica p = new PilhaEstatica(tamanho);
      p.push(15);
      
      int expected = 15;
      int actual = p.peek();

      assertEquals(expected, actual);
   }
}
