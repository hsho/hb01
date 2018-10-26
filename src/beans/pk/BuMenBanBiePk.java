package beans.pk;
import java.io.Serializable;
import javax.persistence.*;
import org.apache.commons.lang.builder.*;
import org.hibernate.validator.*;
@Embeddable
public class BuMenBanBiePk implements Serializable {
    private java.lang.String BMNO;	//部???
    private java.lang.String BBNO;	//班?序?
    public BuMenBanBiePk() {
        super();
    }
    public BuMenBanBiePk(java.lang.String BMNO, java.lang.String BBNO) {
        super();
        this.BMNO = BMNO;
        this.BBNO = BBNO;
    }

    /**
     * 取得部???
     * @returnBMNO 部???
     */
    @Column(name = "BMNO", length = 10)
    public java.lang.String getBMNO() {
        return BMNO;
    }
    /**
     * 設定部???
     * @param BMNO 部???
     */
    public void setBMNO(java.lang.String BMNO) {
        this.BMNO = BMNO;
    }
    /**
     * 取得班?序?
     * @returnBBNO 班?序?
     */
    @Column(name = "BBNO", length = 1)
    public java.lang.String getBBNO() {
        return BBNO;
    }
    /**
     * 設定班?序?
     * @param BBNO 班?序?
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
