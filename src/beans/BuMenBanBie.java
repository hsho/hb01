package beans;
import javax.persistence.IdClass;
import beans.pk.BuMenBanBiePk;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.Length;
import javax.persistence.Column;
/**
* 部?班?
**/
@IdClass(BuMenBanBiePk.class)
@Entity
@Table(name = "HR_BUMEN_BANBIE")
public class BuMenBanBie {
    private java.lang.String BMNO;	//部???
    private java.lang.String BBNO;	//班?序?
    private java.lang.String REMARK;	//?注
    /**
     * 取得部???
     * @return BMNO 部???
     */
    @Id
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
     * @return BBNO 班?序?
     */
    @Id
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
    /**
     * 取得?注
     * @return REMARK ?注
     */
    @Length(max = 100)
    @Column(name = "REMARK")
    public java.lang.String getREMARK() {
        return REMARK;
    }
    /**
     * 設定?注
     * @param REMARK ?注
     */
    public void setREMARK(java.lang.String REMARK) {
        this.REMARK = REMARK;
    }
    private BuMen BMNO_Object;
    /**
     * 取得部???
     * @return BMNO 部???
     */
    @ManyToOne
    @JoinColumn(name="BMNO", referencedColumnName="BMNO", insertable=false, updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
    public BuMen getBMNO_Object() {
        return BMNO_Object;
    }
    /**
     * 設定部???
     * @param BMNO 部???
     */
    public void setBMNO_Object(BuMen BMNO) {
        this.BMNO_Object = BMNO;
    }
    private BanBie BBNO_Object;
    /**
     * 取得班?序?
     * @return BBNO 班?序?
     */
    @ManyToOne
    @JoinColumn(name="BBNO", referencedColumnName="BBNO", insertable=false, updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
    public BanBie getBBNO_Object() {
        return BBNO_Object;
    }
    /**
     * 設定班?序?
     * @param BBNO 班?序?
     */
    public void setBBNO_Object(BanBie BBNO) {
        this.BBNO_Object = BBNO;
    }
}
