/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glavacevic.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.NetFlags;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.Who;

/**
 *
 * @author MacaZekoMiš
 */
public class ObradaSistem {
     public void getCpuTotal() {
        Sigar sigar = new Sigar();
        CpuInfo[] infos;
        try {
            infos = sigar.getCpuInfoList();
            for (int i = 0; i < infos.length; i++) {// 不管是单块CPU还是多CPU都适用
                CpuInfo info = infos[i];
//				System.out.println("Mhz:" + info.getMhz());// CPU的总量MHz
//                mhz_InfoL.setText("Mhz: " + info.getMhz());
//				System.out.println("Vendor：" + info.getVendor());// 获得CPU的卖主，如：Intel
//                vendor_InfoL.setText("Proizvođač: " + info.getVendor());
//				System.out.println("Model：" + info.getModel());// 获得CPU的类别，如：Celeron
//                cpu_InfoL_3.setText("Model: " + info.getModel());
//				System.out.println("Cache Size：" + info.getCacheSize());// 缓冲存储器数量
                System.out.println("**************");
                 System.out.println("**************");
            }
            
        } catch (SigarException e) {
            e.printStackTrace();
        }
    }

    public String getPlatformName() {
        String hostname = "";
        try {
            hostname = InetAddress.getLocalHost().getHostName();
        } catch (Exception exc) {
            Sigar sigar = new Sigar();
            try {
                hostname = sigar.getNetInfo().getHostName();
            } catch (SigarException e) {
                hostname = "localhost.unknown";
            } finally {
                sigar.close();
            }
        }
        return hostname;
    }

    public void testGetOSInfo() {
        OperatingSystem OS = OperatingSystem.getInstance();
//
//        os_Info1_4.setText("Arhitektura: " + OS.getArch());
//
//        os_Info2_2.setText("Proizvođač: " + OS.getVendor());
//
//        os_Info3.setText("Verzija: " + OS.getVersion());
    }
    
     public void testWho() {
        try {
            Sigar sigar = new Sigar();
            Who[] who = sigar.getWhoList();
            if (who != null && who.length > 0) {
                for (int i = 0; i < who.length; i++) {
                    System.out.println("\n~~~~~~~~~" + String.valueOf(i) + "~~~~~~~~~");
                    Who _who = who[i];
//					System.out.println("获取设备getDevice() = " + _who.getDevice());
//					System.out.println("获得主机getHost() = " + _who.getHost());
//					System.out.println("获取的时间getTime() = " + _who.getTime());
                    // 当前系统进程表中的用户名
//					System.out.println("获取用户getUser() = " + _who.getUser());
                    if (i == 3) {
//                        platformU_label.setText(_who.getUser().toString());
//                        platfore_console.setText(_who.getUser().toString() + " : ");

                    }

                }
            }
        } catch (SigarException e) {
            e.printStackTrace();
        }
    }

    public String getDefaultIpAddress() {
        String address = null;
        try {
            address = InetAddress.getLocalHost().getHostAddress();
            // 没有出现异常而正常当取到的IP时，如果取到的不是网卡循回地址时就返回
            // 否则再通过Sigar工具包中的方法来获取
            if (!NetFlags.LOOPBACK_ADDRESS.equals(address)) {
                return address;
            }
        } catch (UnknownHostException e) {
            // hostname not in DNS or /etc/hosts
        }
        Sigar sigar = new Sigar();
        try {
            address = sigar.getNetInterfaceConfig().getAddress();
        } catch (SigarException e) {
            address = NetFlags.LOOPBACK_ADDRESS;
        } finally {
            sigar.close();
        }
        return address;
    }
}
