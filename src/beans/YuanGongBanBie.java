package beans;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import javax.persistence.Column;
/**
* 员工班别(固定班)
**/
@Entity
@Table(name = "HR_YUANGONG_BANBIE")
public class YuanGongBanBie {
    private java.lang.String BMNO;		//部门编号
    private java.lang.String ZWNO;	//职务编号
    private java.lang.String ENO;	//工号
    private java.lang.String BBNO;		//班别序号
    /**
     * @return BMNO 部门编号
     */
    @Column(name = "BMNO", length = 10)
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
     * @return ZWNO 职务编号
     */
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
     * @return ENO 工号
     */
    @Id
    @Column(name = "ENO", length = 10)
    public java.lang.String getENO() {
        return ENO;
    }
    /**
     * @param ENO 工号
     */
    public void setENO(java.lang.String ENO) {
        this.ENO = ENO;
    }
    /**
     * @return BBNO 班别序号
     */
    @Column(name = "BBNO", length = 1)
    public java.lang.String getBBNO() {
        return BBNO;
    }
    /**
     * @param BBNO 班别序号
     */
    public void setBBNO(java.lang.String BBNO) {
        this.BBNO = BBNO;
    }
    
    
    
	private YuanGong yuangong;	//员工
	/**
	 * @return yuangong 员工
	 */
	@OneToOne
	@JoinColumns({
		@JoinColumn(name = "BMNO", referencedColumnName = "BMNO", insertable = false, updatable = false),
		@JoinColumn(name = "ZWNO", referencedColumnName = "ZWNO", insertable = false, updatable = false),
		@JoinColumn(name = "ENO", referencedColumnName = "ENO", insertable = false, updatable = false)
		})
	@NotFound(action = NotFoundAction.IGNORE)
	public YuanGong getYuangong() {
		return yuangong;
	}
	/**
	 * @param yuangong 员工
	 */
	public void setYuangong(YuanGong yuangong) {
		this.yuangong = yuangong;
	}
	
    
	private BuMenBanBie bumenbanbie;	//部门班别
	/**
	 * @return bumenbanbie 部门班别
	 */
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "BMNO", referencedColumnName = "BMNO", insertable = false, updatable = false),
		@JoinColumn(name = "BBNO", referencedColumnName = "BBNO", insertable = false, updatable = false)
		})
	@NotFound(action = NotFoundAction.IGNORE)
	public BuMenBanBie getBumenbanbie() {
		return bumenbanbie;
	}
	/**
	 * @param yuangong 部门班别
	 */
	public void setBumenbanbie(BuMenBanBie bumenbanbie) {
		this.bumenbanbie = bumenbanbie;
	}
    
    
    
    
    
    
}
