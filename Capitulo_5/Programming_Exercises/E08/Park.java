/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpark;

public class Park {
    private String name;
    private Integer size;
    private Boolean PicnicFacilities;

    public Park(String name, Integer size, Boolean PicnicFacilities, Boolean TennisCourt, Boolean Playground, Boolean SwimmingPool) {
        this.name = name;
        this.size = size;
        this.PicnicFacilities = PicnicFacilities;
        this.TennisCourt = TennisCourt;
        this.Playground = Playground;
        this.SwimmingPool = SwimmingPool;
    }
    private Boolean TennisCourt;
    private Boolean Playground;
    private Boolean SwimmingPool;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        if(size >= 0 && size <= 400){
            return size;
        } else{
            return 0;
        }
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Boolean getPicnicFacilities() {
        return PicnicFacilities;
    }

    public void setPicnicFacilities(Boolean tF) {
        this.PicnicFacilities = tF;
    }

    public Boolean getTennisCourt() {
        return TennisCourt;
    }

    public void setTennisCourt(Boolean TC) {
        this.TennisCourt = TC;
    }

    public Boolean getPlayground() {
        return Playground;
    }

    public void setPlayground(Boolean Pg) {
        this.Playground = Pg;
    }

    public Boolean getSwimmingPool() {
        return SwimmingPool;
    }

    public void setSwimmingPool(Boolean SP) {
        this.SwimmingPool = SP;
    }
}
