/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author harshaljaiswal
 */
public class VehicleList {

    private ArrayList<Vehicle> vehicleList;

    public VehicleList() {
        vehicleList = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void addVehicle(String make,
            String model,
            int yearOfMan,
            int maxSeats,
            String serialNo,
            String city,
            String maintenanceDate,
            long time,
            boolean isAvaliable,
            String LicencePlate) {

        Vehicle newVehicle = new Vehicle(make, model,
                yearOfMan,
                maxSeats,
                serialNo,
                city,
                maintenanceDate,
                time,
                isAvaliable,
                LicencePlate
        );

        vehicleList.add(newVehicle);
    }

    public void deleteByLicencePlate(String licence) {
        for (Vehicle v : vehicleList) {

            if (v.getLicencePlate() == licence) {
                vehicleList.remove(v);
                break;
            }
        }
    }

    public void markUnaviable(String licence) {
        int i = -1;

        for (Vehicle v : vehicleList) {
            i++;
            if (v.getLicencePlate() == licence) {
                vehicleList.get(i).setIsAvaliable(false);
                vehicleList.get(i).setUpdateTime(System.currentTimeMillis());
                break;
            }
        }
    }

    public void markAvaliable(String licence) {
        int i = -1;

        for (Vehicle v : vehicleList) {
            i++;
            if (v.getLicencePlate() == licence) {
                vehicleList.get(i).setIsAvaliable(true);
                vehicleList.get(i).setUpdateTime(System.currentTimeMillis());
                break;
            }
        }
    }

    public ArrayList<Vehicle> filterByMade(String make) {

        ArrayList<Vehicle> list = new ArrayList<>();
        for (Vehicle v : vehicleList) {
            if (v.getMake().contains(make)) {
                list.add(v);
            }
        }

        return list;
    }

    public ArrayList<Vehicle> filterByManufYear(int year) {

        ArrayList<Vehicle> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            if (v.getYearOfMan() == year) {
                list.add(v);
            }
        }

        return list;
    }

    public ArrayList<Vehicle> filterBySerialNo(String serialNo) {
        ArrayList<Vehicle> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            if (v.getSerialNo().matches(serialNo)) {
                list.add(v);
            }
        }
        return list;
    }

    public ArrayList<Vehicle> filterByModel(String text) {
        ArrayList<Vehicle> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            if (v.getModel().matches(text)) {
                list.add(v);
            }
        }
        return list;
    }

    public ArrayList<Vehicle> filterByCity(String text) {
        ArrayList<Vehicle> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            if (v.getModel().matches(text)) {
                list.add(v);
            }
        }
        return list;
    }

    public ArrayList<String> getManuf() {
        Set<String> manuf = new HashSet<>();

        ArrayList<String> list = new ArrayList<>();

        for (Vehicle v : vehicleList) {
            manuf.add(v.getMake().toLowerCase());
        }

        for (String s : manuf) {
            list.add(s);
        }
        return list;
    }

    public long getLastUpdateTime() {

        long res = 0;

        for (Vehicle v : vehicleList) {
            if (v.getUpdateTime() > res) {
                res = v.getUpdateTime();
            }
        }
        return res;

    }

}
