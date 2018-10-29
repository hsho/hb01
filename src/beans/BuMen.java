package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import org.hibernate.validator.Length;
import javax.persistence.Column;
/**
* 部门
**/
@Entity
@Table(name = "HR_BUMEN")
public class BuMen {
    private java.lang.String BMNO;
    private java.lang.String PBMNO;
    private java.lang.String BMNM;
    private java.lang.String BMDETAIL;
    /**
     * @return BMNO 部门编号
     */
    @Id
    @Column(name = "BMNO")
    @Length(max=10)
    public java.lang.String getBMNO() {
        return BMNO;
    }
    /**
     * @param BMNO 
     */
    public void setBMNO(java.lang.String BMNO) {
        this.BMNO = BMNO;
    }
    /**
     * @return PBMNO 上级部门编号
     */
    @Length(max = 10)
    @Column(name = "PBMNO")
    public java.lang.String getPBMNO() {
        return PBMNO;
    }
    /**
     * @param PBMNO 
     */
    public void setPBMNO(java.lang.String PBMNO) {
        this.PBMNO = PBMNO;
    }
    /**
     * @return BMNM 部门名称
     */
    @Length(max = 100)
    @Column(name = "BMNM")
    public java.lang.String getBMNM() {
        return BMNM;
    }
    /**
     * @param BMNM 
     */
    public void setBMNM(java.lang.String BMNM) {
        this.BMNM = BMNM;
    }
    /**
     * @return BMDETAIL 部门详细
     */
    @Length(max = 500)
    @Column(name = "BMDETAIL")
    public java.lang.String getBMDETAIL() {
        return BMDETAIL;
    }
    /**
     * @param BMDETAIL 
     */
    public void setBMDETAIL(java.lang.String BMDETAIL) {
        this.BMDETAIL = BMDETAIL;
    }
}
