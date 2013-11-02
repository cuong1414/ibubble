package org.ibubble.controller;

import org.ibubble.dto.DiscountDto;
import org.ibubble.entity.CategoryEntity;
import org.ibubble.entity.DiscountEntity;
import org.ibubble.entity.DrinkingEntity;
import org.ibubble.service.CategoryService;
import org.ibubble.service.DiscountService;
import org.ibubble.service.DrinkingService;
import org.ibubble.util.ConstantManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * User: CuongNM
 * Date: 10/11/13
 * Time: 11:47 PM
 */
@Controller
@RequestMapping(ConstantManager.MAIN_CONTROLLER_MAPPING_URL)
public class MainController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private DrinkingService drinkingService;
    @Autowired
    private DiscountService discountService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String navigateHomepage(Model model) {
        // Navigate to store information tab.
        model.addAttribute(ConstantManager.CATEGORY_LIST_MODEL_NAME, categoryService.getAllActive());
        model.addAttribute(ConstantManager.DRINK_LIST_MODEL_NAME, drinkingService.getAllActive());
        model.addAttribute(ConstantManager.CONTENT_PAGE_MODEL_NAME, "drink-listing");
        return "homepage";
    }

    @RequestMapping(value = "/category/{path}", method = RequestMethod.GET)
    public String navigateHomepage(Model model, @PathVariable("path") String path) {
        if (path != null && !path.isEmpty()) {
            List<CategoryEntity> byPathActive = this.categoryService.getByPathActive(path);
            if (byPathActive.size() > 0) {
                CategoryEntity categoryEntity = byPathActive.get(0);
                // found category.
                List<DrinkingEntity> drinkingEntityList = this.drinkingService.getActiveByCategoryID(categoryEntity.getId());
                // Find discount by category.
                List<DiscountEntity> discountEntityList = this.discountService.getByCategoryID(categoryEntity.getId());
                List<DiscountDto> discountDtoList = this.discountService.parseToDto(discountEntityList);
                // Navigate to store information tab.
                model.addAttribute(ConstantManager.DRINK_LIST_MODEL_NAME, drinkingEntityList);
                model.addAttribute(ConstantManager.DISCOUNT_LIST_MODEL_NAME, discountDtoList);
            }
            model.addAttribute(ConstantManager.CATEGORY_LIST_MODEL_NAME, categoryService.getAllActive());
            model.addAttribute(ConstantManager.CONTENT_PAGE_MODEL_NAME, "drink-listing");
            return "homepage";
        }
        return "redirect:" + ConstantManager.MAIN_CONTROLLER_MAPPING_URL;
    }

    @RequestMapping(value = "/store-info", method = RequestMethod.GET)
    public String navigateStoreInformationPage(Model model) {
        // Navigate to store information tab.
        model.addAttribute(ConstantManager.CATEGORY_LIST_MODEL_NAME, categoryService.getAllActive());
        model.addAttribute(ConstantManager.CONTENT_PAGE_MODEL_NAME, "store-information");
        return "homepage";
    }
}
