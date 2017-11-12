package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvaluadorTest {

	@Test
	 public void testTrue() {
        EvaluadorBoleano evaluador = new EvaluadorBoleano();
        assert evaluador.eval("verdadero") == true;
    }
	@Test
	public void testFalse() {
	    EvaluadorBoleano evaluador = new EvaluadorBoleano();
	    assert evaluador.eval("falso") == false;
	}

}
