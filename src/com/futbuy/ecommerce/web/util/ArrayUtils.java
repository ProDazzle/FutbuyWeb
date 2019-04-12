/**
 * 
 */
package com.futbuy.ecommerce.web.util;

import java.util.ArrayList;
import java.util.List;


import com.fgc.futbuy.model.Color;
import com.fgc.futbuy.model.Talla;
import com.futbuy.ecommerce.web.model.ShoppingCartLine;
import com.fgc.futbuy.model.Jugador;
import com.fgc.futbuy.model.LineaPedido;

public  class ArrayUtils {

	public static List<Color> arrayToColor(String [] arrayParameter){
		
		String[] color = arrayParameter;	
		Color iterator = new Color ();
		List<Color> colores = new ArrayList<Color>();
		for (String c: color) {
			iterator.setIdColor(Integer.valueOf(c));
			colores.add(iterator);
		}
		return colores;
	}
	
	public static List<Talla> arrayToTalla(String [] arrayParameter){
			
			String[] talla = arrayParameter;	
			Talla iterator = new Talla ();
			List<Talla> tallas = new ArrayList<Talla>();
			for (String c: talla) {
				iterator.setIdTalla(Integer.valueOf(c));
				tallas.add(iterator);
			}
			return tallas;
		}
	
	public static List<Jugador> arrayToJugador(String [] arrayParameter){
		
		String[] jugador = arrayParameter;	
		Jugador iterator = new Jugador ();
		List<Jugador> jugadores = new ArrayList<Jugador>();
		for (String c: jugador) {
			iterator.setIdJugador(Integer.valueOf(c));
			jugadores.add(iterator);
		}
		return jugadores;
	}
	
	public static List<LineaPedido> carritoToTicket(List<ShoppingCartLine> lineasCarrito) {
		
			List<LineaPedido> lineas = new ArrayList<LineaPedido>();
			LineaPedido lineaPedido = new LineaPedido();
			for (ShoppingCartLine iterador : lineasCarrito) {
				lineaPedido.setIdProducto(iterador.getProduct().getIdProducto());
				lineaPedido.setPrecioUnitario(iterador.getProduct().getPrecio());
				lineas.add(lineaPedido);
				lineaPedido=new LineaPedido();
			}
			return lineas;
	}
}
