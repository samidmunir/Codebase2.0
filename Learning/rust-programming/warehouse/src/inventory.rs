pub const MANAGER: &str = "Sami M.";
pub const FLOOR_SPACE: i32 = 10000;

#[derive(Debug)]
pub enum ProductCategory {
    Ladder,
    Hammer,
}

#[derive(Debug)]
pub struct Item {
    pub name: String,
    pub category: ProductCategory,
    pub quantity: u32,
}

pub fn talk_to_manager() {
    println!("\ninventory.talk_to_manager() called...");
    println!("- Hey, {MANAGER}, how is the inventory looking like today?");
}
