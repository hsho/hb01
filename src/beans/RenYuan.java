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
* 人?
**/
@Entity
@Table(name = "HR_RENYUAN")
public class RenYuan {
    private java.lang.String IDNO;	//身份??
    private java.lang.String NAME;	//姓名
    private java.lang.String GENDER;	//性?
    private java.lang.String PHONE;	//?人?系方式
    private java.lang.String EMAIL;	//?人?箱
    private XueWei EDCA;	//??
    private java.lang.String DEGREE;	//?位
    /**
     * 取得身份??
     * @return IDNO 身份??
     */
    @Id
    @Column(name = "IDNO")
    public java.lang.String getIDNO() {
        return IDNO;
    }
    /**
     * 設定身份??
     * @param IDNO 身份??
     */
    public void setIDNO(java.lang.String IDNO) {
        this.IDNO = IDNO;
    }
    /**
     * 取得姓名
     * @return NAME 姓名
     */
    @Length(max = 50)
    @Column(name = "NAME")
    public java.lang.String getNAME() {
        return NAME;
    }
    /**
     * 設定姓名
     * @param NAME 姓名
     */
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    /**
     * 取得性?
     * @return GENDER 性?
     */
    @Length(max = 1)
    @Column(name = "GENDER")
    public java.lang.String getGENDER() {
        return GENDER;
    }
    /**
     * 設定性?
     * @param GENDER 性?
     */
    public void setGENDER(java.lang.String GENDER) {
        this.GENDER = GENDER;
    }
    /**
     * 取得?人?系方式
     * @return PHONE ?人?系方式
     */
    @Length(max = 50)
    @Column(name = "PHONE")
    public java.lang.String getPHONE() {
        return PHONE;
    }
    /**
     * 設定?人?系方式
     * @param PHONE ?人?系方式
     */
    public void setPHONE(java.lang.String PHONE) {
        this.PHONE = PHONE;
    }
    /**
     * 取得?人?箱
     * @return EMAIL ?人?箱
     */
    @Length(max = 100)
    @Column(name = "EMAIL")
    public java.lang.String getEMAIL() {
        return EMAIL;
    }
    /**
     * 設定?人?箱
     * @param EMAIL ?人?箱
     */
    public void setEMAIL(java.lang.String EMAIL) {
        this.EMAIL = EMAIL;
    }
    /**
     * 取得??
     * @return EDCA ??
     */
    @Length(max = 1)
    @ManyToOne
    @JoinColumn(name = "EDCA")
    @NotFound(action=NotFoundAction.IGNORE)
    public XueWei getEDCA() {
        return EDCA;
    }
    /**
     * 設定??
     * @param EDCA ??
     */
    public void setEDCA(XueWei EDCA) {
        this.EDCA = EDCA;
    }
    /**
     * 取得?位
     * @return DEGREE ?位
     */
    @Length(max = 1)
    @Column(name = "DEGREE")
    public java.lang.String getDEGREE() {
        return DEGREE;
    }
    /**
     * 設定?位
     * @param DEGREE ?位
     */
    public void setDEGREE(java.lang.String DEGREE) {
        this.DEGREE = DEGREE;
    }
}
