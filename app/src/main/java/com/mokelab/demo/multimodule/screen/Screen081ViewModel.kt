package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data801RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data802RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data803RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data804RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data805RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data806RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data807RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data808RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data809RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data810RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen081ViewModel @Inject constructor(
    private val repo1: Data801RepositoryImpl,
    private val repo2: Data802RepositoryImpl,
    private val repo3: Data803RepositoryImpl,
    private val repo4: Data804RepositoryImpl,
    private val repo5: Data805RepositoryImpl,
    private val repo6: Data806RepositoryImpl,
    private val repo7: Data807RepositoryImpl,
    private val repo8: Data808RepositoryImpl,
    private val repo9: Data809RepositoryImpl,
    private val repo10: Data810RepositoryImpl,

): ViewModel() {
}
