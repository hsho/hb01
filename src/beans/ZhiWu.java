package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import org.hibernate.validator.Length;
import javax.persistence.Column;
/**
* 职务
**/
@Entity
@Table(name = "HR_ZHIWU")
public class ZhiWu {
    private java.lang.String ZWNO;		//职务编号
    private java.lang.String ZWNM;		//职务名称
    private java.lang.String ZWDETAIL;	//职务描述
    /**
     * @return ZWNO 职务编号
     */
    @Id
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
    /**
     * @return ZWNM 职务名称
     */
    @Length(max = 100)
    @Column(name = "ZWNM")
    public java.lang.String getZWNM() {
        return ZWNM;
    }
    /**
     * @param ZWNM 职务名称
     */
    public void setZWNM(java.lang.String ZWNM) {
        this.ZWNM = ZWNM;
    }
    /**
     * @return ZWDETAIL 职务描述
     */
    @Length(max = 500)
    @Column(name = "ZWDETAIL")
    public java.lang.String getZWDETAIL() {
        return ZWDETAIL;
    }
    /**
     * @param ZWDETAIL 职务描述
     */
    public void setZWDETAIL(java.lang.String ZWDETAIL) {
        this.ZWDETAIL = ZWDETAIL;
    }
}
