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
* 部门班别
**/
@IdClass(BuMenBanBiePk.class)
@Entity
@Table(name = "HR_BUMEN_BANBIE")
public class BuMenBanBie {
    private java.lang.String BMNO;		//部门编号
    private java.lang.String BBNO;		//班别序号
    private java.lang.String REMARK;	//备注
    /**
     * @return BMNO 部门编号
     */
    @Id
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
     * @return BBNO 班别序号
     */
    @Id
    public java.lang.String getBBNO() {
        return BBNO;
    }
    /**
     * @param BBNO 班别序号
     */
    public void setBBNO(java.lang.String BBNO) {
        this.BBNO = BBNO;
    }
    /**
     * @return REMARK 备注
     */
    @Length(max = 100)
    @Column(name = "REMARK")
    public java.lang.String getREMARK() {
        return REMARK;
    }
    /**
     * @param REMARK 备注
     */
    public void setREMARK(java.lang.String REMARK) {
        this.REMARK = REMARK;
    }
    
    
    
    private BuMen bumen;
    /**
     * @return BMNO 部门
     */
    @ManyToOne
    @JoinColumn(name="BMNO", referencedColumnName="BMNO", insertable=false, updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
    public BuMen getBumen() {
        return bumen;
    }
    /**
     * @param bumen 部门
     */
    public void setBumen(BuMen bumen) {
        this.bumen = bumen;
    }
    private BanBie banbie;
    /**
     * @return BBNO 班别
     */
    @ManyToOne
    @JoinColumn(name="BBNO", referencedColumnName="BBNO", insertable=false, updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
    public BanBie getBanbie() {
        return banbie;
    }
    /**
     * @param BBNO 班别
     */
    public void setBanbie(BanBie banbie) {
        this.banbie = banbie;
    }
}
