package pl.vxm.netino.books.mod;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Borrowed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idb;
    private Long idp;
    private Date dateBorrowing;
    private boolean returned;

    public Long getId() {
        return id;
    }

    public Long getIdb() {
        return idb;
    }

    public void setIdb(Long idb) {
        this.idb = idb;
    }

    public Long getIdp() {
        return idp;
    }

    public void setIdp(Long idp) {
        this.idp = idp;
    }

    public Date getDateBorrowing() {
        return dateBorrowing;
    }

    public void setDateBorrowing(Date dateBorrowing) {
        this.dateBorrowing = dateBorrowing;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }
}
