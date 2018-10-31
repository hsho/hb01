package beans.pk;
import java.io.Serializable;
import javax.persistence.*;
import org.apache.commons.lang.builder.*;
@SuppressWarnings("serial")
@Embeddable
public class YuanGongPk implements Serializable {
    private String BMNO;	//部门编号
    private String ZWNO;	//职务编号
    private String ENO;		//工号
    public YuanGongPk() {
        super();
    }
    public YuanGongPk(String BMNO, String ZWNO, String ENO) {
        super();
        this.BMNO = BMNO;
        this.ZWNO = ZWNO;
        this.ENO = ENO;
    }

    /**
     * @return BMNO 部门编号
     */
    @Column(name = "BMNO", length = 10)
    public String getBMNO() {
        return BMNO;
    }
    /**
     * @param BMNO 部门编号
     */
    public void setBMNO(String BMNO) {
        this.BMNO = BMNO;
    }
    /**
     * @return ZWNO 职务编号
     */
    @Column(name = "ZWNO", length = 4)
    public String getZWNO() {
        return ZWNO;
    }
    /**
     * @param ZWNO 职务编号
     */
    public void setZWNO(String ZWNO) {
        this.ZWNO = ZWNO;
    }
    /**
     * @return ENO 工号
     */
    @Column(name = "ENO", length = 10)
    public String getENO() {
    	return ENO;
    }
    /**
     * @param ENO 工号
     */
    public void setENO(String ENO) {
    	this.ENO = ENO;
    }
    
    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof YuanGongPk))
            return false;
        YuanGongPk castOther = (YuanGongPk) other;
        return new EqualsBuilder().append(BMNO, castOther.BMNO).append(ZWNO, castOther.ZWNO).append(ENO, castOther.ENO).isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(BMNO).append(ZWNO).append(ENO).toHashCode();
    }
}
