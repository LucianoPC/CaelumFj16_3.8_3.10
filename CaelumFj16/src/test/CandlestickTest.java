package test;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import caelum.Candlestick;

public class CandlestickTest {

	@Test(expected=IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo() {
		Candlestick candlestick = new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());
	}

}
