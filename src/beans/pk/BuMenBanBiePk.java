package beans.pk;
import java.io.Serializable;
import javax.persistence.*;
import org.apache.commons.lang.builder.*;
/**
 * 部门班别
 */
@SuppressWarnings("serial")
@Embeddable
public class BuMenBanBiePk implements Serializable {
    private java.lang.String BMNO;	//部门编号
    private java.lang.String BBNO;	//班别序号
    public BuMenBanBiePk() {
        super();
    }
    public BuMenBanBiePk(java.lang.String BMNO, java.lang.String BBNO) {
        super();
        this.BMNO = BMNO;
        this.BBNO = BBNO;
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
     * @returnBBNO 班别序号
     */
    @Column(name = "BBNO", length = 1)
    public java.lang.String getBBNO() {
        return BBNO;
    }
    /**
     * @param BBNO 班别序号
     */
    public void setBBNO(java.lang.String BBNO) {
        this.BBNO = BBNO;
    }
    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof BuMenBanBiePk))
            return false;
        BuMenBanBiePk castOther = (BuMenBanBiePk) other;
        return new EqualsBuilder().append(BMNO, castOther.BMNO).append(BBNO, castOther.BBNO).isEquals();
    }
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(BMNO).append(BBNO).toHashCode();
    }
}
