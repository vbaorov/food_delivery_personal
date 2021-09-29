package food.delivery.work;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name="CallOrder_table")
public class CallOrder {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String username;
    private String address;
    private String phoneNo;
    private String productid;
    private Integer qty; //type change
    private String payStatus;
    private String userid;
    private String orderStatus;
    private Date orderDate;
    private String productName;
    private Long productPrice;
    private String couponId;
    private String couponKind;
    private String couponUserYn;

    @PostPersist
    public void onPostPersist(){
    	
    	    	
         Logger logger = LoggerFactory.getLogger(this.getClass());
         
         
         
         
         
 
 
 
 
 
 
 
 










        CallOrderPlaced callorderPlaced = new CallOrderPlaced();
        BeanUtils.copyProperties(this, callorderPlaced);
        callorderPlaced.publishAfterCommit();
        System.out.println("\n\n##### CallOrderService : onPostPersist()" + "\n\n");
        System.out.println("\n\n##### callorderplace : "+callorderPlaced.toJson() + "\n\n");
        System.out.println("\n\n##### productid : "+this.productid + "\n\n");
        logger.debug("CallOrderService");
	}
    @PostUpdate
    public void onPostUpdate() {
    	
    	CallOrderCanceled callorderCanceled = new CallOrderCanceled();
        BeanUtils.copyProperties(this, callorderCanceled);
        callorderCanceled.publishAfterCommit();
    }
    
   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getProductId() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }




    public String getCouponid() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
    public String getCouponKind() {
        return couponKind;
    }

    public void setCouponKind(String couponKind) {
        this.couponKind = couponKind;
    }
    
    
    
    
   
   
   
   
    
    
    public String getCouponUserYn() {
        return couponUserYn;
    }

    public void setCouponUserYn(String couponUserYn) {
        this.couponUserYn = couponUserYn;
    }

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setProductId(String productId) {
		this.productid = productId;
	}

}



