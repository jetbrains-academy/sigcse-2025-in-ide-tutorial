from course_section.course_lesson.programming_task.invisible_main import safe_user_input


def choose_your_outfit(temperature: int) -> str:
    if temperature > 25:
        return "It's hot! Wear shorts and a t-shirt."
    elif 15 <= temperature <= 25:
        return "It's mild! Wear jeans and a light sweater."
    else:
        return "It's cold! Wear a jacket and long pants."


if __name__ == "__main__":
    print(choose_your_outfit(safe_user_input()))