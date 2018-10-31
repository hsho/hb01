package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import org.hibernate.validator.Length;
import javax.persistence.Column;
/**
* 学位
**/
@Entity
@Table(name = "HR_XUEWEI")
public class XueWei {
    private java.lang.String DEGREE;	//学位代号
    private java.lang.String NAME;		//学位名称
    /**
     * @return DEGREE 学位代号
     */
    @Id
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
    /**
     * @return NAME 学位名称
     */
    @Length(max = 50)
    @Column(name = "NAME")
    public java.lang.String getNAME() {
        return NAME;
    }
    /**
     * @param NAME 学位名称
     */
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
}
