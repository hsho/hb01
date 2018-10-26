package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import org.hibernate.validator.Length;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import javax.persistence.Column;
/**
* ?工
**/
@Entity
@Table(name = "HR_YUANGONG")
public class YuanGong {
    private java.lang.String ENO;	//工?
    private RenYuan IDNO;	//身份??
    private BuMenZhiWu BMNO;	//部???
    private BuMenZhiWu ZWNO;	//????
    private java.lang.String PHONE;	//?公??
    private java.lang.String EMAIL;	//?公?箱
    /**
     * 取得工?
     * @return ENO 工?
     */
    @Id
    @Column(name = "ENO")
    public java.lang.String getENO() {
        return ENO;
    }
    /**
     * 設定工?
     * @param ENO 工?
     */
    public void setENO(java.lang.String ENO) {
        this.ENO = ENO;
    }
    /**
     * 取得身份??
     * @return IDNO 身份??
     */
    @Length(max = 18)
    @ManyToOne
    @JoinColumn(name = "IDNO")
    @NotFound(action=NotFoundAction.IGNORE)
    public RenYuan getIDNO() {
        return IDNO;
    }
    /**
     * 設定身份??
     * @param IDNO 身份??
     */
    public void setIDNO(RenYuan IDNO) {
        this.IDNO = IDNO;
    }
    /**
     * 取得部???
     * @return BMNO 部???
     */
    @Length(max = 10)
    @ManyToOne
    @JoinColumn(name = "BMNO")
    @NotFound(action=NotFoundAction.IGNORE)
    public BuMenZhiWu getBMNO() {
        return BMNO;
    }
    /**
     * 設定部???
     * @param BMNO 部???
     */
    public void setBMNO(BuMenZhiWu BMNO) {
        this.BMNO = BMNO;
    }
    /**
     * 取得????
     * @return ZWNO ????
     */
    @Length(max = 4)
    @ManyToOne
    @JoinColumn(name = "ZWNO")
    @NotFound(action=NotFoundAction.IGNORE)
    public BuMenZhiWu getZWNO() {
        return ZWNO;
    }
    /**
     * 設定????
     * @param ZWNO ????
     */
    public void setZWNO(BuMenZhiWu ZWNO) {
        this.ZWNO = ZWNO;
    }
    /**
     * 取得?公??
     * @return PHONE ?公??
     */
    @Length(max = 50)
    @Column(name = "PHONE")
    public java.lang.String getPHONE() {
        return PHONE;
    }
    /**
     * 設定?公??
     * @param PHONE ?公??
     */
    public void setPHONE(java.lang.String PHONE) {
        this.PHONE = PHONE;
    }
    /**
     * 取得?公?箱
     * @return EMAIL ?公?箱
     */
    @Length(max = 100)
    @Column(name = "EMAIL")
    public java.lang.String getEMAIL() {
        return EMAIL;
    }
    /**
     * 設定?公?箱
     * @param EMAIL ?公?箱
     */
    public void setEMAIL(java.lang.String EMAIL) {
        this.EMAIL = EMAIL;
    }
}
