package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "productlines")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productline.findAll", query = "SELECT p FROM Productline p")
    , @NamedQuery(name = "Productline.findByProductLine", query = "SELECT p FROM Productline p WHERE p.productLine = :productLine")
    , @NamedQuery(name = "Productline.findByTextDescription", query = "SELECT p FROM Productline p WHERE p.textDescription = :textDescription")})
public class Productline implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "productLine")
    private String productLine;
    @Column(name = "textDescription")
    private String textDescription;
    @Lob
    @Column(name = "htmlDescription")
    private String htmlDescription;
    @Lob
    @Column(name = "image")
    private byte[] image;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productline")
    private List<Product> productList;

    public Productline() {
    }

    public Productline(String productLine) {
        this.productLine = productLine;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @XmlTransient
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productLine != null ? productLine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productline)) {
            return false;
        }
        Productline other = (Productline) object;
        if ((this.productLine == null && other.productLine != null) || (this.productLine != null && !this.productLine.equals(other.productLine))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Productline[ productLine=" + productLine + " ]";
    }

}
