package model;

public class Producto {

	private String codigoProducto;
	private double precioUnitario;
	private int cantidad;
	private int stockMinimo;
	private int idFacturacion;
	private boolean vendido;
	/**
	 * @param codigoProducto
	 * @param precioUnitario
	 * @param cantidad
	 * @param stockMinimo
	 * @param idFacturacion
	 * @param vendido
	 */
	public Producto(String codigoProducto, double precioUnitario, int cantidad, int stockMinimo, int idFacturacion,
			boolean vendido) {
		this.codigoProducto = codigoProducto;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		this.stockMinimo = stockMinimo;
		this.idFacturacion = idFacturacion;
		this.vendido = vendido;
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	public int getIdFacturacion() {
		return idFacturacion;
	}
	public void setIdFacturacion(int idFacturacion) {
		this.idFacturacion = idFacturacion;
	}
	public boolean isVendido() {
		return vendido;
	}
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

}
