/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author MacaZekoMiš
 */
@Entity
@Table(name = "ordersitems", catalog = "technoj18", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ordersitems.findAll", query = "SELECT o FROM Ordersitems o")
    , @NamedQuery(name = "Ordersitems.findByOrderId", query = "SELECT o FROM Ordersitems o WHERE o.ordersitemsPK.orderId = :orderId")
    , @NamedQuery(name = "Ordersitems.findByProductId", query = "SELECT o FROM Ordersitems o WHERE o.ordersitemsPK.productId = :productId")
    , @NamedQuery(name = "Ordersitems.findByQuantity", query = "SELECT o FROM Ordersitems o WHERE o.quantity = :quantity")})
public class Ordersitems implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrdersitemsPK ordersitemsPK;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;

    public Ordersitems() {
    }

    public Ordersitems(OrdersitemsPK ordersitemsPK) {
        this.ordersitemsPK = ordersitemsPK;
    }

    public Ordersitems(OrdersitemsPK ordersitemsPK, int quantity) {
        this.ordersitemsPK = ordersitemsPK;
        this.quantity = quantity;
    }

    public Ordersitems(int orderId, int productId) {
        this.ordersitemsPK = new OrdersitemsPK(orderId, productId);
    }

    public OrdersitemsPK getOrdersitemsPK() {
        return ordersitemsPK;
    }

    public void setOrdersitemsPK(OrdersitemsPK ordersitemsPK) {
        this.ordersitemsPK = ordersitemsPK;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        int oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordersitemsPK != null ? ordersitemsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordersitems)) {
            return false;
        }
        Ordersitems other = (Ordersitems) object;
        if ((this.ordersitemsPK == null && other.ordersitemsPK != null) || (this.ordersitemsPK != null && !this.ordersitemsPK.equals(other.ordersitemsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "glavacevic.view.Ordersitems[ ordersitemsPK=" + ordersitemsPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
