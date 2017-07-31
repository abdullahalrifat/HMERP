package com.abdullah.Controller;

import com.abdullah.CustomerListDataBase.CustomerDetails;
import com.abdullah.Customers.CustomersListBean;
import com.abdullah.Employee.EmployeeBean;
import com.abdullah.EmployeeDatabase.EmployeeDetails;
import com.abdullah.Inventory.InventoryListBean;
import com.abdullah.InventoryDataBase.InventoryDetails;
import com.abdullah.Product.ProductListBean;
import com.abdullah.ProductDatabase.ProductDetails;
import com.abdullah.ProfitAndLoss.ProfitLossCalculate;
import com.abdullah.Project.ProjectBean;
import com.abdullah.ProjectDatabase.ProjectDetails;
import com.abdullah.Purchase.PurchaseListBean;
import com.abdullah.PurchaseDatabase.PurchaseDetails;
import com.abdullah.Sales.SalesListBean;
import com.abdullah.SalesDatabase.SalesDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by abdullah on 1/31/17.
 */

@Controller
public class Home
{
    @RequestMapping(value="/index")
    public ModelAndView processIndex()
    {
        ModelAndView model= null;
        try
        {
                model = new ModelAndView("Home");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/elements")
    public ModelAndView processElements()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Elements");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/charts")
    public ModelAndView processCharts()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Charts");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/panels")
    public ModelAndView processPanels()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Panels");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/notifications")
    public ModelAndView processNotifications()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Notifications");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/page-profile")
    public ModelAndView processPageProfile()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Page-Profile");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/page-login")
    public ModelAndView processPageLogin()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Login-Page");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/page-lockscreen")
    public ModelAndView processPageLockscreen()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Page-LockScreen");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/tables")
    public ModelAndView processTables()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Tables");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/typography")
    public ModelAndView processTypography()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Typography");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/icons")
    public ModelAndView processIcons()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Icons");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }

    //own added
    @Autowired
    EmployeeDetails emp;
    @RequestMapping(value="/employees")
    public ModelAndView processEmployees()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Employees");

            List<EmployeeBean> employeeList = emp.getList();


             //checking if reading the databse
           // System.out.println(employeeList.get(0).getName());

            model.addObject("employeeList",employeeList);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }

    @RequestMapping(value="/Addemployees")
    public ModelAndView processAddEmployees()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("AddEmployees","register-Employee-entity",new EmployeeBean());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    //own added
    @Autowired
    ProjectDetails pmps;
    @RequestMapping(value="/projects")
    public ModelAndView processProject()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Projects");

            List<ProjectBean> projectList = pmps.getList();


            //checking if reading the databse
             //System.out.println(projectList.get(0).getProjectName());

            model.addObject("projectList",projectList);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @Autowired
    CustomerDetails cumdet;
    @RequestMapping(value="/CustomersList")
    public ModelAndView processCustomers()
    {
        ModelAndView model= null;

        try
        {
            model = new ModelAndView("CustomersList");

            List<CustomersListBean> customerList = cumdet.getListofCustomers();


            //checking if reading the databse
            //System.out.println(projectList.get(0).getProjectName());

            model.addObject("customerList",customerList);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/AddCustomers")
    public ModelAndView processAddCustomers()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("AddCustomers","register-Customers-entity",new CustomersListBean());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/UpdateCustomers")
    public ModelAndView processUpdateCustomers()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("UpdateCustomers","update-Customers-entity",new CustomersListBean());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }


    @Autowired
    ProductDetails prdet;
    @RequestMapping(value="/ProductList")
    public ModelAndView processProducts()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("ProductList");

            List<ProductListBean> productList = prdet.getListProducts();


            //checking if reading the databse
            //System.out.println(projectList.get(0).getProjectName());

            model.addObject("productList",productList);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/AddProducts")
    public ModelAndView processAddProduct()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("AddProducts","register-Product-entity",new ProductListBean());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/UpdateProducts")
    public ModelAndView processUpdateProducts()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("UpdateProducts","update-Product-entity",new ProductListBean());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @Autowired
    PurchaseDetails purdet;
    @RequestMapping(value="/PurchaseList")
    public ModelAndView processPurchase()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("PurchaseList");

            List<PurchaseListBean> purchaseList = purdet.getListPurchase();


            //checking if reading the databse
            //System.out.println(purchaseList.get(0).getProduct());

            model.addObject("purchaseList",purchaseList);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/AddPurchase")
    public ModelAndView processAddPurchase()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("AddPurchase","register-Purchase-entity",new PurchaseListBean());
            List<ProductListBean> proList = prdet.getListProducts();


            //checking if reading the databse
            //System.out.println(projectList.get(0).getProjectName());

            model.addObject("productList",proList);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/UpdatePurchase")
    public ModelAndView processUpdatePurchase()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("UpdatePurchase","update-Purchase-entity",new PurchaseListBean());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @Autowired
    SalesDetails sldet;
    @RequestMapping(value="/SalesList")
    public ModelAndView processSales()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("SalesList");

            List<SalesListBean>salesList = sldet.getListSales();


            //checking if reading the databse
            //System.out.println(salesList.get(0).getProduct());

            model.addObject("salesList",salesList);


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/AddSales")
    public ModelAndView processAddSales()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("AddSales","register-Sales-entity",new SalesListBean());
            List<InventoryListBean> proList = inv.getListInventory();
            List<CustomersListBean> customerList = cumdet.getListofCustomers();


            //checking if reading the databse
            //System.out.println(projectList.get(0).getProjectName());

            model.addObject("customerList",customerList);
            model.addObject("productList",proList);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/UpdateSales")
    public ModelAndView processUpdateSales()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("UpdateSales","update-Sales-entity",new SalesListBean());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @Autowired
    ProfitLossCalculate plc;
    @RequestMapping(value="/ProfitLoss")
    public ModelAndView processProfitLoss()
    {
        plc.CalculateIncome();
        plc.CalculateExpense();
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("ProfitLoss");
            model.addObject("income",plc.getIncome());
            model.addObject("expense",plc.getExpense());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @Autowired
    InventoryDetails inv;
    @RequestMapping(value="/InventoryList")
    public ModelAndView processInventory()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("InventoryList");

            List<InventoryListBean> productList = inv.getListInventory();


            //checking if reading the databse
            //System.out.println(projectList.get(0).getProjectName());

            model.addObject("productList",productList);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/AddInventory")
    public ModelAndView processAddInventory()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("AddInventory","register-Inventory-entity",new InventoryListBean());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(value="/UpdateInventory")
    public ModelAndView processUpdateInventory()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("UpdateInventory","update-Inventory-entity",new InventoryListBean());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }

/*
    @RequestMapping(value="/projects")
    public ModelAndView processProjects()
    {
        ModelAndView model= null;
        try
        {
            model = new ModelAndView("Projects");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return model;
    }*/




}
