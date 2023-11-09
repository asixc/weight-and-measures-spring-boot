package dev.jotxee.weightandmeasures.controller;

import dev.jotxee.weightandmeasures.controller.dto.MedidasForm;
import dev.jotxee.weightandmeasures.service.MedidasService;
import dev.jotxee.weightandmeasures.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MedidasController {

    private final MedidasService medidasService;
    private final UserService userService;


    @PostMapping("/{userId}")
    public String guardar(MedidasForm medidasForm, @PathVariable("userId") int userId,
                          RedirectAttributes redirectAttributes) {
        log.debug("Guarda medidas de:{} [{}]", userId, medidasForm);
        medidasService.guardarMedidas(medidasForm, userId);
        redirectAttributes.addFlashAttribute("mensaje", "Solicitud procesada correctamente");
        return "redirect:/" + userId;
    }


    @GetMapping("/{userId}")
    public String getAllMedidasByUsuario(@PathVariable("userId") int userId, Model model) {
        model.addAllAttributes(
                Map.of(
                        "medidas", medidasService.getAllMedidasByUsuario(userId),
                        "title", "Toma de medidas",
                        "userId", userId
                )
        );

        return "user-info";
    }

    @GetMapping("/")
    public String getUsers(Model model) {
        model.addAllAttributes(
                Map.of(
                        "users", userService.getAll(),
                        "title", "Medidas Herbalife"
                )
        );
        return "index";
    }

}
