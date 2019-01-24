
package cfranc.com;
import static org.junit.Assert.*;

import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
/*
  @author cv682147
 */
public class MarinaVoufoTest {
        @Test
	public void test() {
		Markov m = new Markov();
		m.readFile("cosette.txt");
		Couple p = Markov.randomElement(m.couples.keySet());
		String res = m.generateText(p, 10);
		assertNotNull(res);
		System.out.println(res);
	}
        @Test
        public void xxx(){
           Markov m = new Markov();
		m.readFile("tester.txt");
              
    
           
        }
         @Test
            public void TestGenerateTest(){
              getStringFromgenerateTest();
               assertNotNull(res);
  
            }
         @Test
            public void TestHashCode(){
                
             Markov m = new Markov();
             String w1 = get.first.hashCode;
             String w2 = get.second.hashCode;
             Couple 1 = couple(w1,w2);
             assertEquals("w1 w2");
        }
         @Test
            public void TestHashCodeEclipse(){
               Couple 1 = couple(w1,w2);
               Couple 2 = couple(w1,w2);
            }
            
            
          
}
