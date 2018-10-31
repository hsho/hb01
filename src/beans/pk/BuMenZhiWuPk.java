package beans.pk;
import java.io.Serializable;
import javax.persistence.*;
import org.apache.commons.lang.builder.*;
@SuppressWarnings("serial")
@Embeddable
public class BuMenZhiWuPk implements Serializable {
    private java.lang.String BMNO;	//部门编号
    private java.lang.String ZWNO;	//职务编号
    public BuMenZhiWuPk() {
        super();
    }
    public BuMenZhiWuPk(java.lang.String BMNO, java.lang.String ZWNO) {
        super();
        this.BMNO = BMNO;
        this.ZWNO = ZWNO;
    }

    /**
     * @returnBMNO 部门编号
     */
    @Column(name = "BMNO", length = 10)
    public java.lang.String getBMNO() {
        return BMNO;
    }
    /**
     * @param BMNO 部门编号
     */
    public void setBMNO(java.lang.String BMNO) {
        this.BMNO = BMNO;
    }
    /**
     * @returnZWNO 职务编号
     */
    @Column(name = "ZWNO", length = 4)
    public java.lang.String getZWNO() {
        return ZWNO;
    }
    /**
     * @param ZWNO 职务编号
     */
    public void setZWNO(java.lang.String ZWNO) {
        this.ZWNO = ZWNO;
    }
    
    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof BuMenZhiWuPk))
            return false;
        BuMenZhiWuPk castOther = (BuMenZhiWuPk) other;
        return new EqualsBuilder().append(BMNO, castOther.BMNO).append(ZWNO, castOther.ZWNO).isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(BMNO).append(ZWNO).toHashCode();
    }
}
