package model;

import java.util.Date;

public class Facturacion {

	private int nroFactura;
	private Date fechaCompra;
	private String clienteCompra;
	private String vendedorFactura;
	private String detalleProductos;
	/**
	 * @param nroFactura
	 * @param fechaCompra
	 * @param clienteCompra
	 * @param vendedorFactura
	 * @param detalleProductos
	 */
	public Facturacion(int nroFactura, Date fechaCompra, String clienteCompra, String vendedorFactura,
			String detalleProductos) {
		this.nroFactura = nroFactura;
		this.fechaCompra = fechaCompra;
		this.clienteCompra = clienteCompra;
		this.vendedorFactura = vendedorFactura;
		this.detalleProductos = detalleProductos;
	}
	public int getNroFactura() {
		return nroFactura;
	}
	public void setNroFactura(int nroFactura) {
		this.nroFactura = nroFactura;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public String getClienteCompra() {
		return clienteCompra;
	}
	public void setClienteCompra(String clienteCompra) {
		this.clienteCompra = clienteCompra;
	}
	public String getVendedorFactura() {
		return vendedorFactura;
	}
	public void setVendedorFactura(String vendedorFactura) {
		this.vendedorFactura = vendedorFactura;
	}
	public String getDetalleProductos() {
		return detalleProductos;
	}
	public void setDetalleProductos(String detalleProductos) {
		this.detalleProductos = detalleProductos;
	}
	
	
}
