package model.entity;

import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.repackaged.org.joda.time.DateTimeZone;
import com.google.appengine.repackaged.org.joda.time.LocalDateTime;
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Product  {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long id;
	@Persistent private String nombre;
	@Persistent private String code;
	@Persistent private int quant;
	@Persistent private double cost;
	
	public Product( String nombre, double cost,int quant, String code) {
		this.cost = cost;
		this.quant=quant;
		this.code = code;
		this.nombre=nombre;
	}
	public Long getId() {
		return id;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public boolean compareTo(Product x) {
		if(this.nombre.equals(x.nombre)&&
				this.code.equals(x.code)&&
				this.quant==(x.quant)&&
				this.cost==x.cost
				) 
			return true;
		else return false;
	}
	
}
