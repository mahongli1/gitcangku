package io.mhl.mhl_opencart.dto.out;

public class AddressListOutDTO {

    private Integer addressId;
    private String receiverName;
    private String rceiverMobile;
    private String content;
    private String tag;

    public AddressListOutDTO() {
    }

    public AddressListOutDTO(Integer addressId, String receiverName, String rceiverMobile, String content, String tag) {
        this.addressId = addressId;
        this.receiverName = receiverName;
        this.rceiverMobile = rceiverMobile;
        this.content = content;
        this.tag = tag;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getRceiverMobile() {
        return rceiverMobile;
    }

    public void setRceiverMobile(String rceiverMobile) {
        this.rceiverMobile = rceiverMobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
