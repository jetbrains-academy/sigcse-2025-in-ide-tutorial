import unittest  # Replace 'your_module' with the actual module name where your function is defined

from course_section.course_lesson.programming_task.main import choose_your_outfit


class TestChooseYourOutfit(unittest.TestCase):
    HOT_WEATHER = "It's hot! Wear shorts and a t-shirt."
    MILD_WEATHER = "It's mild! Wear jeans and a light sweater."
    COLD_WEATHER = "It's cold! Wear a jacket and long pants."

    def test_temperature_above_25_should_recommend_hot_outfit(self):
        self.assertEqual(self.HOT_WEATHER, choose_your_outfit(30))
        self.assertEqual(self.HOT_WEATHER, choose_your_outfit(26))

    def test_temperature_between_15_and_25_inclusive_should_recommend_mild_outfit(self):
        self.assertEqual(self.MILD_WEATHER, choose_your_outfit(25))
        self.assertEqual(self.MILD_WEATHER, choose_your_outfit(20))
        self.assertEqual(self.MILD_WEATHER, choose_your_outfit(15))

    def test_temperature_below_15_should_recommend_cold_outfit(self):
        self.assertEqual(self.COLD_WEATHER, choose_your_outfit(10))
        self.assertEqual(self.COLD_WEATHER, choose_your_outfit(0))
        self.assertEqual(self.COLD_WEATHER, choose_your_outfit(-5))  # Test negative temperature

    def test_boundary_values_should_be_handled_correctly(self):
        # Test the exact boundary conditions
        self.assertEqual(self.MILD_WEATHER, choose_your_outfit(25))
        self.assertEqual(self.MILD_WEATHER, choose_your_outfit(15))
        self.assertEqual(self.HOT_WEATHER, choose_your_outfit(26))
        self.assertEqual(self.COLD_WEATHER, choose_your_outfit(14))
