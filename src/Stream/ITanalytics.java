package Stream;

import java.util.List;
import java.util.Optional;

public class ITanalytics {


    //    Правила сборки отчета CriticalPathReport:
//            1) releaseName: Должно состоять из версии и кодового имени (если оно есть)
//    в скобках.
//    Пример: если кодовое имя есть — "1.2.0 (Apollo)", если Optional пустой
//    — просто "1.2.1". Использовать if-else нельзя.
//2) totalCriticalPoints: Сумма storyPoints всех критических фич во всех эпиках релиза.
//3) missingSkills: Список уникальных требуемых навыков (requiredSkills),
//    отсортированный по алфавиту. Берем навыки только из критических фич,
//    у которых НЕТ исполнителя (assignee пустой). Это те навыки, людей с
//    которыми нам срочно нужно искать.
//4) mostLoadedProgrammer: Имя программиста, на которого назначено больше
//    всего storyPoints суммарно среди всех критических фич этого релиза.
//    Если критических задач с назначенными программистами вообще нет,
//    вернуть строку "Нет назначенных".
    public static void main(String[] args) {

    }

    public CriticalPathReport buildReport(Release release) {

        String releaseName = release.version() +
                release.codeName()
                        .map(name -> " (" + name + ")")
                        .orElse("");

        int totalCriticalPoints = release.epics().stream()
                .flatMap(epic -> epic.features().stream())
                .filter(Feature::isCritical)
                .mapToInt(Feature::storyPoints)
                .sum();

        List<String> missingSkills = release.epics().stream()
                .flatMap(epic -> epic.features().stream())
                .filter(Feature::isCritical)
                .filter(feature -> feature.assignee().isEmpty())
                .flatMap(feature -> feature.requiredSkills().stream())
                .distinct()
                .sorted()
                .toList();

        String mostLoadedProgrammer = release.epics().stream()
                .flatMap(epic -> epic.features().stream())
                .filter(Feature::isCritical)
                .filter(feature -> feature.assignee().isPresent())
                .collect(
                        java.util.stream.Collectors.groupingBy(
                                feature -> feature.assignee().get().name(),
                                java.util.stream.Collectors.summingInt(Feature::storyPoints)
                        )
                )
                .entrySet()
                .stream()
                .max(java.util.Map.Entry.comparingByValue())
                .map(java.util.Map.Entry::getKey)
                .orElse("Нет назначенных");

        return new CriticalPathReport(
                releaseName,
                totalCriticalPoints,
                missingSkills,
                mostLoadedProgrammer
        );
    }


}

record Programmer(String name) {
}

record Feature(String title, int storyPoints, List<String> requiredSkills, Optional<Programmer> assignee,
               // Назначен ли кто-то на задачу
               boolean isCritical) {
}

record Epic(String name, List<Feature> features) {
}

record Release(String version, Optional<String> codeName, // Кодовое имя может быть, а может не быть
               List<Epic> epics) {
}


//    Объект отчета, который нужно собрать:
record CriticalPathReport(String releaseName,          // Имя релиза
                          int totalCriticalPoints,     // Сумма Story Points всех критических фич
                          List<String> missingSkills,  // Навыки, которых не хватает
                          String mostLoadedProgrammer  // Имя самого загруженного программиста
) {
}