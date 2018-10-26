package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.validator.Length;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import javax.persistence.Column;
/**
* 
**/
@Entity
@Table(name = "HR_YUANGONG_BANBIE")
public class YuanGongBanBie {
    private BuMenBanBie BMNO;
    private java.lang.String ZWNO;
    private java.lang.String ENO;
    private BuMenBanBie BBNO;
    /**
     * @return BMNO 
     */
    @Length(max = 10)
    @ManyToOne
    @JoinColumn(name = "BMNO")
    @NotFound(action=NotFoundAction.IGNORE)
    public BuMenBanBie getBMNO() {
        return BMNO;
    }
    /**
     * @param BMNO 
     */
    public void setBMNO(BuMenBanBie BMNO) {
        this.BMNO = BMNO;
    }
    /**
     * @return ZWNO 
     */
    @Length(max = 4)
    @Column(name = "ZWNO")
    public java.lang.String getZWNO() {
        return ZWNO;
    }
    /**
     * @param ZWNO 
     */
    public void setZWNO(java.lang.String ZWNO) {
        this.ZWNO = ZWNO;
    }
    /**
     * @return ENO 
     */
    @Length(max = 10)
    @Column(name = "ENO")
    public java.lang.String getENO() {
        return ENO;
    }
    /**
     * @param ENO 
     */
    public void setENO(java.lang.String ENO) {
        this.ENO = ENO;
    }
    /**
     * @return BBNO 
     */
    @Length(max = 1)
    @ManyToOne
    @JoinColumn(name = "BBNO")
    @NotFound(action=NotFoundAction.IGNORE)
    public BuMenBanBie getBBNO() {
        return BBNO;
    }
    /**
     * @param BBNO 
     */
    public void setBBNO(BuMenBanBie BBNO) {
        this.BBNO = BBNO;
    }
}
