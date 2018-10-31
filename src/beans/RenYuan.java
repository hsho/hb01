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
* 人员
**/
@Entity
@Table(name = "HR_RENYUAN")
public class RenYuan {
    private java.lang.String IDNO;		//身份证号
    private java.lang.String NAME;		//姓名
    private java.lang.String GENDER;	//性别
    private java.lang.String PHONE;		//个人联系方式
    private java.lang.String EMAIL;		//个人邮箱
    private java.lang.String EDCA;		//学历代号
    private java.lang.String DEGREE;	//学位代号
    /**
     * @return IDNO 身份证号
     */
    @Id
    @Column(name = "IDNO", length = 18)
    public java.lang.String getIDNO() {
        return IDNO;
    }
    /**
     * @param IDNO 身份证号
     */
    public void setIDNO(java.lang.String IDNO) {
        this.IDNO = IDNO;
    }
    /**
     * @return NAME 姓名
     */
    @Length(max = 50)
    @Column(name = "NAME")
    public java.lang.String getNAME() {
        return NAME;
    }
    /**
     * @param NAME 姓名
     */
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
    /**
     * @return GENDER 性别
     */
    @Column(name = "GENDER", length = 1)
    public java.lang.String getGENDER() {
        return GENDER;
    }
    /**
     * @param GENDER 性别
     */
    public void setGENDER(java.lang.String GENDER) {
        this.GENDER = GENDER;
    }
    /**
     * @return PHONE 个人联系方式
     */
    @Length(max = 50)
    @Column(name = "PHONE")
    public java.lang.String getPHONE() {
        return PHONE;
    }
    /**
     * @param PHONE 个人联系方式
     */
    public void setPHONE(java.lang.String PHONE) {
        this.PHONE = PHONE;
    }
    /**
     * @return EMAIL 个人邮箱
     */
    @Length(max = 100)
    @Column(name = "EMAIL")
    public java.lang.String getEMAIL() {
        return EMAIL;
    }
    /**
     * @param EMAIL 个人邮箱
     */
    public void setEMAIL(java.lang.String EMAIL) {
        this.EMAIL = EMAIL;
    }
    /**
     * @return EDCA 学历代号
     */
    @Column(name = "EDCA", length = 1)
    public java.lang.String getEDCA() {
        return EDCA;
    }
    /**
     * @param EDCA 学历代号
     */
    public void setEDCA(java.lang.String EDCA) {
        this.EDCA = EDCA;
    }
    /**
     * @return DEGREE 学位代号
     */
    @Column(name = "DEGREE", length = 1)
    public java.lang.String getDEGREE() {
        return DEGREE;
    }
    /**
     * @param DEGREE 学位代号
     */
    public void setDEGREE(java.lang.String DEGREE) {
        this.DEGREE = DEGREE;
    }
    
    
    private XueLi xueli;	//学历
    /**
     * @return xueli 学历
     */
    @ManyToOne
    @JoinColumn(name = "EDCA", referencedColumnName = "EDCA", insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    public XueLi getXueli() {
    	return xueli;
    }
    /**
     * @param xueli 学历
     */
    public void setXueli(XueLi xueli) {
    	this.xueli = xueli;
    }
    
    
    
    private XueWei xuewei;	//学位
    /**
     * @return xuewei 学位
     */
    @ManyToOne
    @JoinColumn(name = "DEGREE", referencedColumnName = "DEGREE", insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    public XueWei getXueWei() {
    	return xuewei;
    }
    /**
     * @param xuewei 学位
     */
    public void setXueWei(XueWei xuewei) {
    	this.xuewei = xuewei;
    }
    
}
